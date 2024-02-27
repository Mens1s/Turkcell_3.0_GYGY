package dataAccess.HibernateRepositoryImp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class HibernateRepositoryClass<T, ID> implements HibernateRepository<T, ID> {
    private List<T> db;

    public HibernateRepositoryClass() {
        this.db = new ArrayList<>();
    }

    public T findById(ID id) {
        return this.db.stream()
                .filter(entity -> isIdMatch(entity, id))
                .findFirst().orElse(null);
    }

    public T findByName(String name) {
        return this.db.stream()
                .filter(entity -> isNameMatch(entity, name))
                .findFirst().orElse(null);
    }

    public void delete(ID id) {
        this.db.stream()
                .filter(entity -> isIdMatch(entity, id))
                .findFirst().ifPresent(deletedItem -> this.db.remove(deletedItem));
        System.out.println("Hibernate ile silindi.");
    }

    public T save(T entity) {
        ID idUpdatableData = isHaveId(entity);

        if (!idUpdatableData.equals(0)) {
            T finalEntity = entity;
            this.db.stream()
                    .filter(e -> isIdMatch(e, idUpdatableData))
                    .findFirst().ifPresent(updateData -> this.db.set(this.db.indexOf(updateData), finalEntity));
            System.out.println("Hibernate ile güncellendi.");
            return entity;
        }
        // decide id
        entity = decideID(entity);

        if (entity == null)
            return null;

        db.add(entity);
        System.out.println("Hibernate ile eklendi.");
        return entity;
    }

    private boolean isIdMatch(T entity, ID id) {
        try {
            Method getIdMethod = entity.getClass().getMethod("getId");
            Object entityId = getIdMethod.invoke(entity);

            return entityId.equals(id);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    private boolean isNameMatch(T entity, String name) {
        try {
            Method getNameMethod = entity.getClass().getMethod("getName");
            Object entityName = getNameMethod.invoke(entity);


            return entityName.equals(name);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    private T decideID(T entity) {
        try {

            Method setIdMethod = entity.getClass().getMethod("setId", int.class);
            setIdMethod.invoke(entity, this.db.size() + 1);
            return entity;
        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private ID isHaveId(T entity) {
        try {
            Method getIdMethod = entity.getClass().getMethod("getId");
            Object entityId = getIdMethod.invoke(entity);

            return (ID) entityId;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

}
