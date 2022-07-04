package pl.coderslab.charity.service;


import org.springframework.stereotype.Service;

import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

@Service
public class DonationService {

    final DonationRepository donationRepository;


    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public int sumUp() {
        return donationRepository.sumUp();
    }

    public long countAllDonations() {
        return donationRepository.count();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }

}
