package dev.zevolution.netflixhexaarch.transportlayers.restapi;

import dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase;
import dev.zevolution.netflixhexaarch.transportlayers.mapper.SoftwareMapper;
import dev.zevolution.transportlayers.openapi.api.AuthorsApi;
import dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@Api(tags = "Authors")
public class AuthorsApiImpl implements AuthorsApi {

    private final GetSoftwareByAuthorAndSoftwareNameUseCase getSoftwareByAuthorAndSoftwareNameUseCase;

    public AuthorsApiImpl(GetSoftwareByAuthorAndSoftwareNameUseCase getSoftwareByAuthorAndSoftwareNameUseCase) {
        this.getSoftwareByAuthorAndSoftwareNameUseCase = getSoftwareByAuthorAndSoftwareNameUseCase;
    }

    @Override
    public ResponseEntity<List<SoftwareByAuthorResult>> getSoftwaresByAuthor(String authorName, String softwareName) {
        var software = this.getSoftwareByAuthorAndSoftwareNameUseCase.execute(authorName, softwareName);
        var softwares = asList(software);

        return ResponseEntity.ok(SoftwareMapper.INSTANCE.map(softwares));
    }

}