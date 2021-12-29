package dev.zevolution.netflixhexaarch.interactors;

import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.netflixhexaarch.repositories.SoftwareRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetSoftwareByAuthorAndSoftwareNameUseCaseTest {

    @Mock
    private SoftwareRepository softwareRepository;

    @InjectMocks
    private GetSoftwareByAuthorAndSoftwareNameUseCase getSoftwareByAuthorAndSoftwareNameUseCase;

    @Test
    void shouldReturnSucessWhenGetSoftwareByAuthorAndSoftwareNameUseCase() {
        var name = "Software Name";
        var description = "Software Description";
        var score = 100;
        var author = "Software Author";

        var mockObject = new Software().setName(name).setDescription(description).setScore(score).setAuthor(author);

        when(this.softwareRepository.getSoftwareByAuthorAndSoftwareName(any(), any())).thenReturn(mockObject);

        var entityResponse = this.getSoftwareByAuthorAndSoftwareNameUseCase.execute("author", "softwareName");

        assertNotNull(entityResponse);
        assertThat(name, equalTo(entityResponse.getName()));
        assertThat(description, equalTo(entityResponse.getDescription()));
        assertThat(score, equalTo(entityResponse.getScore()));
        assertThat(author, equalTo(entityResponse.getAuthor()));
    }

}