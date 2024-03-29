package com.scholarshipholders.dummy;

import com.scholarshipholders.core.model.CreateScholarModel;
import com.scholarshipholders.core.model.GetScholarModel;
import com.scholarshipholders.core.model.UpdateScholarModel;
import com.scholarshipholders.entrypoint.dto.request.CreateScholarRequestDTO;
import com.scholarshipholders.entrypoint.dto.request.UpdateScholarRequestDTO;
import com.scholarshipholders.entrypoint.dto.response.GetScholarResponseDTO;
import com.scholarshipholders.entrypoint.dto.response.UpdateScholarResponseDTO;
import com.scholarshipholders.infrastructure.entity.ScholarEntity;
import com.scholarshipholders.infrastructure.entity.enums.DocumentTypeEnum;

import java.util.UUID;

public class ScholarDummy {

    public static ScholarEntity.ScholarEntityBuilder scholarEntityBuilder() {
        return ScholarEntity.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe");
    }

    public static GetScholarModel.GetScholarModelBuilder getScholarModelBuilder() {
        return GetScholarModel.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe");
    }

    public static GetScholarResponseDTO.GetScholarResponseDTOBuilder getScholarResponseDTOBuilder() {
        return GetScholarResponseDTO.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe");
    }

    public static CreateScholarRequestDTO.CreateScholarRequestDTOBuilder createScholarRequestDTOBuilder() {
        return CreateScholarRequestDTO.builder()
                .fullName("John Doe")
                .accountNumber(1L)
                .bankAgency(2)
                .bankCode(3)
                .document("11122233344")
                .documentType(DocumentTypeEnum.CPF);
    }

    public static CreateScholarModel.CreateScholarModelBuilder createScholarModelBuilder() {
        return CreateScholarModel.builder()
                .fullName("John Doe")
                .accountNumber(1L)
                .bankAgency(2)
                .bankCode(3)
                .document("11122233344")
                .documentType(DocumentTypeEnum.CPF);
    }

    public static UpdateScholarRequestDTO.UpdateScholarRequestDTOBuilder updateScholarRequestDTOBuilder() {
        return UpdateScholarRequestDTO.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe")
                .accountNumber(1L)
                .bankAgency(2)
                .bankCode(3)
                .document("11122233344")
                .documentType(DocumentTypeEnum.CPF);
    }

    public static UpdateScholarModel.UpdateScholarModelBuilder updateScholarModelBuilder() {
        return UpdateScholarModel.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe")
                .accountNumber(1L)
                .bankAgency(2)
                .bankCode(3)
                .document("11122233344")
                .documentType(DocumentTypeEnum.CPF);
    }

    public static UpdateScholarResponseDTO.UpdateScholarResponseDTOBuilder updateScholarResponseDTOBuilder() {
        return UpdateScholarResponseDTO.builder()
                .id(UUID.randomUUID())
                .fullName("John Doe")
                .accountNumber(1L)
                .bankAgency(2)
                .bankCode(3)
                .document("11122233344")
                .documentType(DocumentTypeEnum.CPF);
    }
}
