package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mballem.curso.boot.domain.Funcionario;
import com.mballem.curso.boot.dao.FuncionarioDao;

@Service @Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao funcionarioDao;
	@Override
	public void salvar(Funcionario funcionario) {
		funcionarioDao.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {
		funcionarioDao.update(funcionario);
	}

	@Override
	public void exluir(Long id) {
		funcionarioDao.delete(id);
	}

	
	@Override @Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		return funcionarioDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		return funcionarioDao.findAll();
	}
	
}
