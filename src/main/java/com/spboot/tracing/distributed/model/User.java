package com.spboot.tracing.distributed.model;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
public class User {

  private String firstName;
  private String lastName;
  private String emailId;
  private List<String> permissions;

}
