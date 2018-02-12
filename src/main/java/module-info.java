module com.domineospring.domain {
    requires hibernate.jpa;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports com.domineospring.domain.models;
    exports com.domineospring.domain.repository;
}