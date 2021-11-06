package com.dao.sql;

import java.util.Optional;

/**
 * base dao module interface
 */
public interface TaskDao {
    /**
     * add data
     *
     * @return true: insert success; false: insert failed
     */
    boolean add();

    /**
     * delete data
     *
     * @return true: delete success; false: delete failed
     */
    boolean delete();

    /**
     * set date
     *
     * @return true: set success; false: set failed
     */
    boolean set();

    /**
     * get data
     *
     * @return
     */
    Optional get();
}
