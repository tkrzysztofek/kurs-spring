package com.example.todoapp.logic;

import com.example.todoapp.TaskConfigurationProperties;
import com.example.todoapp.model.ProjectRepository;
import com.example.todoapp.model.TaskGroupRepository;
import com.example.todoapp.model.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class LogicConfiguration {

    @Bean
    ProjectService projectService(TaskConfigurationProperties config,
                                  TaskGroupRepository taskGroup,
                                  ProjectRepository repository) {
        return new ProjectService(repository, taskGroup, config);
    }

    @Bean
    TaskGroupService taskGroupService(TaskGroupRepository repository,
                                      TaskRepository taskRepository) {
        return new TaskGroupService(repository, taskRepository);
    }

}
