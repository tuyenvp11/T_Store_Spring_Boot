package com.example.spring_boot_app.Services;

import com.example.spring_boot_app.Model.Vendor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IVendorService {
    public List<Vendor> ListVendor() ;
    Optional<Vendor> findVendorById(int vendor_id);
    public Vendor addVendor(Vendor add_vendor);
    public Vendor updateVendor(Vendor edit_vendor);
    public Vendor deleteVendor(int vendor_id);
    public List<Vendor> searchVendor(String vendor_name);
    Page<Vendor> getAll(Pageable pageable);
}
