/*
 * This file is generated by jOOQ.
 */
package generated_jooq.tables.interfaces;


import java.io.Serializable;

import javax.validation.constraints.Size;


/**
 * 全局配置表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRole extends Serializable {

    /**
     * Setter for <code>jooq_flyway.role.id</code>. 主键ID
     */
    public IRole setId(Long value);

    /**
     * Getter for <code>jooq_flyway.role.id</code>. 主键ID
     */
    public Long getId();

    /**
     * Setter for <code>jooq_flyway.role.user_id</code>. 用户ID
     */
    public IRole setUserId(Long value);

    /**
     * Getter for <code>jooq_flyway.role.user_id</code>. 用户ID
     */
    public Long getUserId();

    /**
     * Setter for <code>jooq_flyway.role.role_name</code>. 角色名称
     */
    public IRole setRoleName(String value);

    /**
     * Getter for <code>jooq_flyway.role.role_name</code>. 角色名称
     */
    @Size(max = 64)
    public String getRoleName();

    /**
     * Setter for <code>jooq_flyway.role.create_at</code>. 创建时间
     */
    public IRole setCreateAt(Long value);

    /**
     * Getter for <code>jooq_flyway.role.create_at</code>. 创建时间
     */
    public Long getCreateAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRole
     */
    public void from(IRole from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRole
     */
    public <E extends IRole> E into(E into);
}