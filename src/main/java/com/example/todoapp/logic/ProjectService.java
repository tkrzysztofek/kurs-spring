package com.example.todoapp.logic;

import com.example.todoapp.model.Project;
import com.example.todoapp.model.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Service
@RequestScope
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> readAllProjects(){
        return projectRepository.findAll();
    }

    public void saveProject(Project project){
        projectRepository.save(project);
    }


}
