package com.cybertek.repository;

import com.cybertek.entity.Account;
import com.cybertek.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    // ------------------- DERIVED QUERIES ------------------- //
//Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findAllByRole(UserRole role);

    //Write a derived query to list all accounts between a range of ages
    List<Account> findAllByAgeBetween(Integer age1, Integer age2);
//Write a derived query to list all accounts where the beginning of the address contains the keyword

    List<Account> findAllByAddressStartingWith(String pattern);
    //Write a derived query to sort the list of accounts with age
    List<Account> findAllByOrderByAgeDesc();

// ------------------- JPQL QUERIES ------------------- //
//Write a JPQL query that returns all accounts

    @Query("SELECT a from Account a")
    List<Account> fetchAllJPQL();

//Write a JPQL query to list all admin accounts

    @Query("SELECT a from Account a where a.role='USER'")
    List<Account> fetchAdminUsers();


//Write a JPQL query to sort all accounts with age

    @Query("SELECT a from Account a ORDER BY a.age desc ")
    List<Account> orderByAgeJPQL();

// ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value="select * from account_details WHERE age<?1",nativeQuery = true)
    List<Account> retrieveAllByAgeLessThan(Integer age);
    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value="select * from account_details WHERE name ILIKE concat('%',?1,'%')or country ILIKE concat('%',?1,'%') or address ILIKE concat('%',?1,'%') or stateILIKE concat('%',?1,'%')",nativeQuery = true)

    List<Account> retrieveBySearchCriteria(String pattern);


    //Write a native query to read all accounts with an age greater than a specific value
    @Query(value="select * from account_details WHERE age>?1",nativeQuery = true)
    List<Account> retrieveLessThanAge(Integer age);

}
