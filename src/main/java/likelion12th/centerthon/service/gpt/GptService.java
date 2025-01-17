package likelion12th.centerthon.service.gpt;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface GptService {

    ResponseEntity<?> getAssistantMsg(String question) throws JsonProcessingException;

    void saveQnaHist(String question, String answer);

}
