package com.tushar.PG.Management.System.service;

import com.tushar.PG.Management.System.model.Candidate;
import com.tushar.PG.Management.System.repo.PgRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgService {
    @Autowired
    private PgRepo repo;

    public List<Candidate> getAllCandidates() {
        return repo.getAllCandidates();
    }

    public List<Candidate> getCandidateInRoom(int roomNo) {
        return repo.getCandidateInRoom(roomNo);
    }

    public void addCandidate(Candidate candidate) {
        repo.addCandidate(candidate);
    }

    public void updateCandidate(Candidate candidate) {
       repo.updateCandidate(candidate);
    }

    public void deleteCandidate(int id) {
    repo.deleteCandidate(id);
    }
}
