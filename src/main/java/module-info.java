module com.domineospring.domain {
    requires hibernate.jpa;

    exports com.domineospring.domain.models;
    exports com.domineospring.domain.repository;
}