package vn.sun.membermanagementsystem.services;

import vn.sun.membermanagementsystem.dto.response.TeamDTO; // Import DTO
import vn.sun.membermanagementsystem.dto.request.CreateTeamRequest;
import vn.sun.membermanagementsystem.dto.request.UpdateTeamRequest;
import vn.sun.membermanagementsystem.dto.response.TeamDTO;
import vn.sun.membermanagementsystem.dto.response.TeamDetailDTO;
import vn.sun.membermanagementsystem.entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    List<TeamDTO> getAllTeams();

    Optional<TeamDTO> getTeamById(Long id);

    Optional<Team> getTeamEntityById(Long id);
    List<Team> getAllTeams();
    Optional<Team> getTeamById(Long id);

    TeamDTO createTeam(CreateTeamRequest request);

    TeamDTO updateTeam(Long id, UpdateTeamRequest request);

    boolean deleteTeam(Long id);

    TeamDetailDTO getTeamDetail(Long id);

    List<TeamDTO> getAllTeams();
}
