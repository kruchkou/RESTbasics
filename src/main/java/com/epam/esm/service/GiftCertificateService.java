package com.epam.esm.service;

import com.epam.esm.model.dto.GiftCertificateDTO;

import java.util.List;

public interface GiftCertificateService {

    void deleteCertificate(int id);

    GiftCertificateDTO getGiftCertificateByID(int id);

    GiftCertificateDTO createGiftCertificate(GiftCertificateDTO giftCertificateDTO);

    GiftCertificateDTO updateCertificate(GiftCertificateDTO giftCertificateDTO, int id);

    List<GiftCertificateDTO> getCertificates();

    List<GiftCertificateDTO> getCertificatesByTagName(String tagName);

    List<GiftCertificateDTO> getCertificatesByNameOrDescription(String searchText);

}
