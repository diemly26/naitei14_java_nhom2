package vn.sun.membermanagementsystem.services;

import vn.sun.membermanagementsystem.entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    List<Team> getAllTeams();
    Optional<Team> getTeamById(Long id);
}