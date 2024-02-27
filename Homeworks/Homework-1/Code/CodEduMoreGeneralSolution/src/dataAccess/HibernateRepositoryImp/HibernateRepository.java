package dataAccess.HibernateRepositoryImp;

public interface HibernateRepository <T, ID> {
    T findById(ID id);
    T findByName(String name);
    void delete(ID id);
    T save(T entity);
}
