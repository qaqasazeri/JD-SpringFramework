package com.cybertek.repository;

import com.cybertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {

    //Display all regions in Canada
   List<Region> findByCountry(String country);

    //Display all distinct regions in Canada
    List<Region> findDistinctByCountry(String country);

    //Display all regions with country name includes "United"
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes "United" in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);
}
