/*
 * This file is generated by jOOQ.
 */
package generated_jooq.tables.pojos;


import generated_jooq.tables.interfaces.IRole;

import javax.validation.constraints.Size;


/**
 * 全局配置表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements IRole {

    private static final long serialVersionUID = 1273023728;

    private Long   id;
    private Long   userId;
    private String roleName;
    private Long   createAt;

    public Role() {}

    public Role(IRole value) {
        this.id = value.getId();
        this.userId = value.getUserId();
        this.roleName = value.getRoleName();
        this.createAt = value.getCreateAt();
    }

    public Role(
        Long   id,
        Long   userId,
        String roleName,
        Long   createAt
    ) {
        this.id = id;
        this.userId = userId;
        this.roleName = roleName;
        this.createAt = createAt;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Long getUserId() {
        return this.userId;
    }

    @Override
    public Role setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Size(max = 64)
    @Override
    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    @Override
    public Long getCreateAt() {
        return this.createAt;
    }

    @Override
    public Role setCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Role other = (Role) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (roleName == null) {
            if (other.roleName != null)
                return false;
        }
        else if (!roleName.equals(other.roleName))
            return false;
        if (createAt == null) {
            if (other.createAt != null)
                return false;
        }
        else if (!createAt.equals(other.createAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.roleName == null) ? 0 : this.roleName.hashCode());
        result = prime * result + ((this.createAt == null) ? 0 : this.createAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleName);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRole from) {
        setId(from.getId());
        setUserId(from.getUserId());
        setRoleName(from.getRoleName());
        setCreateAt(from.getCreateAt());
    }

    @Override
    public <E extends IRole> E into(E into) {
        into.from(this);
        return into;
    }
}
