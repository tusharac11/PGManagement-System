package com.tushar.PG.Management.System.repo;

import com.tushar.PG.Management.System.model.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PgRepo {

    List<Candidate> candidateList = new ArrayList<>(Arrays.asList(
            new Candidate(1, "Aman", "Sharma", "9874565632", 101, 1),
            new Candidate(2, "Ram", "Jha", "9874905632", 202, 2),
            new Candidate(3, "Kunal", "Dindokar", "9874565632", 101, 2),
            new Candidate(4, "Purav", "Sable", "9874565632", 201, 1)
    ));


    public List<Candidate> getAllCandidates() {
        System.out.println("inside repo");
        return candidateList;
    }

    public List<Candidate> getCandidateInRoom(int roomNo) {
        List<Candidate> temp = new ArrayList<>();
        for (Candidate c : candidateList) {
            if (c.getRoomNo() == roomNo) {
                temp.add(c);
            }
        }
        if (temp.size() == 0) return null;

        return temp;
    }

    public void addCandidate(Candidate candidate) {
        candidateList.add(candidate);

    }

    public void updateCandidate(Candidate c) {
        for (Candidate candidate : candidateList) {
            if (c.getCId() == candidate.getCId()) {
                candidate.setCId(c.getCId());
                candidate.setCFirstName(c.getCFirstName());
                candidate.setCLastName((c.getCLastName()));
                candidate.setRoomNo(c.getRoomNo());
                candidate.setBedNo(c.getBedNo());
                candidate.setCMobileNo(c.getCMobileNo());

            }
        }
    }

    public void deleteCandidate(int id) {
        for (Candidate candidate : candidateList) {
            if (candidate.getCId() == id) {
               candidateList.remove(candidate);

            }
        }
    }
}
