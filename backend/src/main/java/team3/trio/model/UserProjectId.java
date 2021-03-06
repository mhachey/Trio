package team3.trio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserProjectId implements Serializable {
 
    @Column(name = "user_id")
    private Long userId;
 
    @Column(name = "project_id")
    private Long projectId;
 
    private UserProjectId() {}
 
    public UserProjectId(
        Long userId, 
        Long projectId) {
        this.userId = userId;
        this.projectId = projectId;
    }
 
    //Getters omitted for brevity
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass()) 
            return false;
 
        UserProjectId that = (UserProjectId) o;
        return Objects.equals(userId, that.userId) && 
               Objects.equals(projectId, that.projectId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(userId, projectId);
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
    
    
}