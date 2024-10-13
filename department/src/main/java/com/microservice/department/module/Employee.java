package com.microservice.department.module;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
