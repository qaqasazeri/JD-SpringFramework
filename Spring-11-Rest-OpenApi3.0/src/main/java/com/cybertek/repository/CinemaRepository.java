package com.cybertek.repository;

import com.cybertek.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

// ------------------- DERIVED QUERIES ------------------- //
//Write a derived query to get cinema with a specific name


   /*ptional<Cinema> findByName(String name);


//Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String sponsorName);

//Write a derived query to list all cinemas in a specific country
    List<Cinema> findAllByLocation_Country(String country);

//Write a derived query to list all cinemas with a specific name or sponsored name
List<Cinema> findAllBySponsoredNameOrName(String sponsorName, String name);

// ------------------- JPQL QUERIES ------------------- //
//Write a JPQL query to read the cinema name with a specific id

    @Query("select c.name from Cinema c where c.id=?1")
    String fetchByIdJPQL(Integer id);
// ------------------- Native QUERIES ------------------- //
//Write a native query to read all cinemas by location country
   @Query(value = "Select * from cinema c JOIN location l ON l.id=c.location_id where l.country=?1",nativeQuery = true)
    List<Cinema> retrieveAllByLocation_Country(String country);

//Write a native query to read all cinemas by name or sponsored name contains a specific pattern

    @Query(value = "Select * from cinema where name ILIKE concat('%',?1,'%') or sponsored_name ILIKE concat('%',?1,'%')",nativeQuery = true)
    List<Cinema> findAllBySponsoredNameOrName(String pattern);

//Write a native query to sort all cinemas by name
    @Query(value = "Select * from cinema order by name",nativeQuery = true)
    List<Cinema> sortByName();
//Write a native query to distinct all cinemas by sponsored name
    @Query(value = "Select DISTINCT sponsored_name from cinema",nativeQuery = true)
    List<Cinema> distinctBySponsorName();
*/

}
