package craftvillage.datalayer.entities;
// Generated Mar 10, 2020 9:28:01 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import craftvillage.corelayer.utilities.ConstantParameter;

/**
 * UrRole generated by hbm2java
 */
@Entity
@Table(name = "UR_ROLE", schema = ConstantParameter._SCHEMA_NAME)
public class UrRole implements java.io.Serializable {

  private int id;
  private String roleCode;
  private String describe;
  private Set<UrUser> urUsers = new HashSet<UrUser>(0);

  public UrRole() {}

  public UrRole(int id) {
    this.id = id;
  }

  public UrRole(int id, String roleCode, String describe, Set<UrUser> urUsers) {
    this.id = id;
    this.roleCode = roleCode;
    this.describe = describe;
    this.urUsers = urUsers;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "ROLE_CODE", length = 40)
  public String getRoleCode() {
    return this.roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  @Column(name = "`DESCRIBE`", length = 100)
  public String getDescribe() {
    return this.describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }

  @JsonBackReference
  @ManyToMany(mappedBy = "urRoles", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
  public Set<UrUser> getUrUsers() {
    return this.urUsers;
  }

  public void setUrUsers(Set<UrUser> urUsers) {
    this.urUsers = urUsers;
  }

}
