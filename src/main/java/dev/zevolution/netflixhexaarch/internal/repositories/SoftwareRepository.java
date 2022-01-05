package dev.zevolution.netflixhexaarch.internal.repositories;

import dev.zevolution.netflixhexaarch.internal.entities.Software;

public interface SoftwareRepository {

    Software getSoftwareByAuthorAndSoftwareName(String author, String softwareName);

}
