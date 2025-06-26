package com.triagem.service;

import com.triagem.model.Medico;
import com.triagem.model.Paciente;
import com.triagem.repository.MedicoRepository;
import com.triagem.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TriagemService {

    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public Paciente salvarTriagem(Paciente paciente) {
        return pacienteRepo.save(paciente);
    }

    public Medico cadastrarMedico(Medico medico) {
        return medicoRepo.save(medico);
    }

    public Medico atualizarPlantao(Long id, boolean emPlantao) {
        Medico medico = medicoRepo.findById(id).orElseThrow();
        medico.setEmPlantao(emPlantao);
        return medicoRepo.save(medico);
    }

    public Paciente buscarPaciente(Long id) {
        return pacienteRepo.findById(id).orElseThrow();
    }

    public Paciente proximoAtendimento() {
        List<Medico> medicos = medicoRepo.findByEmPlantaoTrue();
        if (medicos.isEmpty()) throw new RuntimeException("Nenhum médico em plantão");

        return pacienteRepo.findAll().stream()
                .sorted(Comparator.comparing(Paciente::getPrioridade)
                        .thenComparing(Paciente::getGravidade))
                .findFirst()
                .orElseThrow();
    }
}
