import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StudentService{

    @Autowired
    StudentRepository repo;

    @Override
    public Student createData(Student stu){
        return repo.save(stu);
    }

    @Override
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
}