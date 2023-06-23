package com.example.injection.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "REPOSITORY")
public record RepositoryModel(@Id Integer id, Integer repositoryid, String nodeid, String name, String fullname, String htmlurl, String description) {
}