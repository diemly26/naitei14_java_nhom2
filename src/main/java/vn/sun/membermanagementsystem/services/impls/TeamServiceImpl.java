package vn.sun.membermanagementsystem.services.impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.sun.membermanagementsystem.entities.Team;
import vn.sun.membermanagementsystem.repositories.TeamRepository;
import vn.sun.membermanagementsystem.services.TeamService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public List<Team> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        return teams != null ? teams : Collections.emptyList();
    }

    @Override
    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }
}