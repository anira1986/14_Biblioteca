
/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.biblioteca.persistence;

import java.sql.SQLException;

public interface IEmprestimoDAO {
    EmprestimoDAO abrir() throws SQLException;

    void fechar();
}