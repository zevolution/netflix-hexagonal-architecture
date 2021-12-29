package dev.zevolution.netflixhexaarch.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

@AnalyzeClasses(packages = "dev.zevolution", importOptions = ImportOption.DoNotIncludeTests.class)
public class HexagonalTest {

    @ArchTest
    public static final ArchRule layersValidator = Architectures.layeredArchitecture()
            .layer("Entities").definedBy("..entities..")
            .layer("Interactors").definedBy("..interactors..")
            .layer("Repositories").definedBy("..repositories..")
            .layer("Datasources").definedBy("..datasources..")
            .layer("TransportLayers").definedBy("..transportlayers..")
            .layer("Configs").definedBy("..configs..")
            .whereLayer("Interactors").mayOnlyBeAccessedByLayers("TransportLayers", "Configs")
            .whereLayer("Repositories").mayOnlyBeAccessedByLayers("Interactors", "Datasources", "Configs")
            .whereLayer("Datasources").mayOnlyBeAccessedByLayers("Configs")
            .whereLayer("TransportLayers").mayOnlyBeAccessedByLayers("Configs")
            .whereLayer("Configs").mayNotBeAccessedByAnyLayer();

}
