import java.util.List;

import com.encore.mvc.controller.SelectController;
import com.encore.mvc.controller.insertController;
import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

public class MvcMain {

	public static void main(String[] args) {
		
		// 사용자의 입력화면을 통해서 게시글 작성을 요청하는 영역
		insertController insert = new insertController();
		
		// 사용자가 입력한 값을 DTO에 담아서 controller 에게 전달
		/*
		PostRequestDTO params = new PostRequestDTO();
		params.setTitle("불금");
		params.setContent("마라탕먹으러감");
		params.setWriter("섭섭해");
		int flag = insert.execute(params);
		*/
		
		/*
		Map<String ,String> map = new HashMap<String, String>();
		map.put("title", "불필요한 금요일");
		map.put("content", "병원에 가자");
		map.put("writer", "섭섭해");
		int flag = insert.execute(map);
		
		System.out.println(">>> insert Result : " + flag);
		*/
		
		System.out.println(">>> 전체 출력 <<<");
		SelectController select = new SelectController();
		List<PostResponseDTO> list = select.execute();
		// 출력
		
		System.out.println(">>> 전체 게시글 조회 <<<");
        for (PostResponseDTO post : list) {
            System.out.println("제목: " + post.getTitle());
            System.out.println("내용: " + post.getContent());
            System.out.println("작성자: " + post.getWriter());
            System.out.println("-----------------------------");
        }
	}

}
