package dev.zevolution.netflixhexaarch.transportlayers.mapper;

import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SoftwareMapper {

    SoftwareMapper INSTANCE = Mappers.getMapper(SoftwareMapper.class);

    SoftwareByAuthorResult map(Software source);
    List<SoftwareByAuthorResult> map(List<Software> source);

}
