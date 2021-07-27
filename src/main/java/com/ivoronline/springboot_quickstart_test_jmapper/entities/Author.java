package com.ivoronline.springboot_quickstart_test_jmapper.entities;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

public class Author {

  //PROPERTIES
                     public Integer id;    //Don't map since there is no @JMap Annotation
  @JMap              public String  name;  //Name of the Source Property should be the same "name"
  @JMap("authorAge") public Integer age;   //Name of the Source Property should be "authorAge"

  //GETTERS
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

  //SETTERS
  public void  setName(String  name) { this.name = name; }
  public void  setAge (Integer age ) { this.age  = age;  }


}
