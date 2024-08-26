package com.example.spring_boot_app.Repository;

import com.example.spring_boot_app.Model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {

}
