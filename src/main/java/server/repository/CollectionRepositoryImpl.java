package server.repository;

import org.springframework.stereotype.Repository;
import server.bean.Bd;
import server.bean.CollectionMock;

import java.util.List;

/**
 * Created by b.bassac on 24/05/2016.
 */
@Repository

public class CollectionRepositoryImpl implements CollectionRepositoryCustom {

    @Override
    public List<Bd> getCollection() {
        return CollectionMock.getCollection();
    }


}
