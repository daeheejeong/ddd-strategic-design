package camp.nextstep.edu.kitchenpos.menu.dao;

import camp.nextstep.edu.kitchenpos.menu.model.menugroup.MenuGroup;

import java.util.List;
import java.util.Optional;

public interface MenuGroupDao {
    MenuGroup save(MenuGroup entity);

    Optional<MenuGroup> findById(Long id);

    List<MenuGroup> findAll();

    boolean existsById(Long id);
}
