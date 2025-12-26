package com.tushar.PG.Management.System;

import com.tushar.PG.Management.System.model.Candidate;
import com.tushar.PG.Management.System.service.PgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PgRestController {

    @Autowired
    private PgService service;

    @GetMapping("candidates")
    public List<Candidate> getAllCandidates() {
        return service.getAllCandidates();
    }

    @GetMapping("candidates/{roomNo}")
    public List<Candidate> getCandidateInRoom(@PathVariable("roomNo") int roomNo) {
        return service.getCandidateInRoom(roomNo);

    }

    @PostMapping("candidate")
    public void addCandidate(@RequestBody Candidate candidate) {
        service.addCandidate(candidate);
    }

    @PutMapping("candidate")
    public void updateCandidate(@RequestBody Candidate candidate){
        service.updateCandidate(candidate);

    }

    @DeleteMapping("candidate/{candidateId}")
    public String deleteCandidate( @PathVariable("candidateId") int id){
        service.deleteCandidate(id);
        return "success" ;
    }
}
