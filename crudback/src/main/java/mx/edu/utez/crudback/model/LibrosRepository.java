package mx.edu.utez.crudback.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LibrosRepository extends JpaRepository<Libros,Long>{
    
}
