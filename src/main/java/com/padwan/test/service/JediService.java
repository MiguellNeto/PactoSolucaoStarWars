package com.padwan.test.service;

import com.padwan.test.dto.JediDTO;
import com.padwan.test.entity.Jedi;
import com.padwan.test.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<JediDTO> findAll() {
        List<Jedi> jedis = repository.findAll();
        List<JediDTO> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediDTO(it)));
        return listJedis;
    }

    public JediDTO incluir(JediDTO jediDTO) {
        Jedi jedi = new Jedi();
        jedi.setId(jediDTO.getId());
        jedi.setNome(jediDTO.getNome());
        jedi.setMentor(jediDTO.getMentor());
        jedi.setMidichlorians(jediDTO.getMidichlorians());
        jedi.setAprendiz(jediDTO.getAprendiz());
        jedi.setTipoDeStatus(jediDTO.getTipoDeStatus());
        return new JediDTO(repository.save(jedi));
    }
}
