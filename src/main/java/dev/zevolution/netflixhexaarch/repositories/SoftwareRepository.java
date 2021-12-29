package dev.zevolution.netflixhexaarch.repositories;

import dev.zevolution.netflixhexaarch.entities.Software;

public interface SoftwareRepository {

    Software getSoftwareByAuthorAndSoftwareName(String author, String softwareName);

}
