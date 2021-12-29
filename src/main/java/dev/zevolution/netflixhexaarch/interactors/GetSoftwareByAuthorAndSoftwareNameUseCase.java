package dev.zevolution.netflixhexaarch.interactors;

import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.netflixhexaarch.repositories.SoftwareRepository;
import org.springframework.stereotype.Service;

@Service
public class GetSoftwareByAuthorAndSoftwareNameUseCase {

    private final SoftwareRepository softwareRepository;

    public GetSoftwareByAuthorAndSoftwareNameUseCase(SoftwareRepository softwareRepository) {
        this.softwareRepository = softwareRepository;
    }

    public Software execute(String author, String softwareName) {
        return this.softwareRepository.getSoftwareByAuthorAndSoftwareName(author, softwareName);
    }

}
