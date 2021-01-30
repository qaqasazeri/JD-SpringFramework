package com.cybertek.repository;

import com.cybertek.entity.Movie;
import com.cybertek.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

   /* // ------------------- DERIVED QUERIES ------------------- //
    //Write a derived query to count how many tickets a user bought
    Integer countAllByUserId(Long userId);

    //Write a derived query to list all tickets by specific email
    List<Ticket> findAllByUserEmail(String email);

    //Write a derived query to count how many tickets are sold for a specific movie
    Integer countAllByMovieCinemaMovieName(String name);

    //Write a derived query to list all tickets between a range of dates
    List<Ticket> findAllByDateTimeBetween(LocalDateTime date1, LocalDateTime date2);

    // ------------------- JPQL QUERIES ------------------- //
    //Write a JPQL query that returns all tickets are bought from a specific user
    @Query("SELECT t from Ticket t where t.user.id=?1")
    Integer fetchAllTicketByUserId(Long userId);

    //Write a JPQL query that returns all tickets between a range of dates
    @Query("SELECT t from Ticket t where t.dateTime BETWEEN ?1 And ?2")
    List<Ticket> fetchAllTicketsDateTimeBetween(LocalDateTime date1, LocalDateTime date2);

    // ------------------- Native QUERIES ------------------- //
//Write a native query to count the number of tickets a user bought
    @Query(value = "SELECT count(*) from ticket  where user_account_id=?1", nativeQuery = true)
    Integer retrieveAllTicketsByUserId(Long userId);
//Write a native query to count the number of tickets a user bought in a specific range of dates

    @Query(value = "SELECT count(*) from ticket where user_account_id=?1 And date_time between ?1 and ?2", nativeQuery = true)
    Integer countTicketsByDateTimeBetween(Long userId, LocalDateTime date1, LocalDateTime date2);

    //Write a native query to distinct all tickets by movie name
    @Query(value = "select  DISTINCT (m.name) from ticket join movie_cinema mc on mc.id=ticket.movie_cinema_id Join movie m on mc.movie_id=m.id", nativeQuery = true)
    List<Ticket> retrieveAllDistinctMovieNames();

    //Write a native query to find all tickets by user email
    @Query(value = "SELECT * from ticket Join user_account ua On ticker.user_account_id=ua.id where ua.email=?1", nativeQuery = true)
    List<Ticket> retrieveAllByUserEmail(String email);

    //Write a native query that returns all tickets
    @Query(value = "SELECT * from ticket", nativeQuery = true)
    List<Ticket> retrieveAll();
//Write a native query to list all tickets where a specific value should be containable in the username or name or movie name
   @Query(value = "SELECT * from ticket Join user_account ua On ticker.user_account_id=ua.id"+
           " Join account_details ad ON ad.id=ua.account_details_id"+
           "Join movie_ciname mc ON mc.id=ticket.movie_cinema_id"+
           "Join movie m On m.id=mc.movie_id"+
           "where ua.username ILIKE concat('%,?1,'%')or ad.name ILIKE concat('%,?1,'%') orm.name ILIKE concat('%,?1,'%') ", nativeQuery = true)
    List<Ticket> retrieveAllBySearchCriteria();*/
}
