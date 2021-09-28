package factory;

import dao.SingerDao;

public interface AbstractSingerDaoFactory {

    public SingerDao createSingerDao();

}
