package org.turarova.controller;

import lombok.Getter;
import lombok.Setter;
import org.turarova.entity.Status;

@Getter
@Setter
public class TaskInfo {
    private String description;
    private Status status;
}
