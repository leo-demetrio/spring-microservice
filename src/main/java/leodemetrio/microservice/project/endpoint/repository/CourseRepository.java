package leodemetrio.microservice.project.endpoint.repository;

import leodemetrio.microservice.project.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
