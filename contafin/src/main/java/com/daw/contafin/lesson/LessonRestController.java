/*package com.daw.contafin.lesson;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.daw.contafin.ImageService;
import com.daw.contafin.exercise.Exercise;
import com.daw.contafin.exercise.ExerciseRepository;
import com.daw.contafin.exercise.ExerciseService;
import com.daw.contafin.lesson.Lesson;
import com.daw.contafin.lesson.LessonRepository;
import com.daw.contafin.lesson.LessonService;
import com.daw.contafin.unit.UnitService;
import com.daw.contafin.lesson.Lesson.UnitLesson;
import com.daw.contafin.user.User;
import com.daw.contafin.user.UserComponent;
import com.daw.contafin.user.UserService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/api/unit")
public class LessonRestController{
	
	interface UnitLesson extends Lesson.UnitLesson {}
	
	@Autowired
	private UnitService unitService;
	
	@Autowired
	private LessonService lessonService;

	@Autowired
	private ExerciseService exerciseService;
	
	@Autowired
	UserService userService;

	@Autowired
	UserComponent userComponent;

	@Autowired
	ImageService imageService;

	byte[] bytes1;
	byte[] bytes2;
	byte[] bytes3;
	Exercise exercise;

	//See all the Unit
	@JsonView(UnitBassic.class)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Unit> getunit() {
		return unitService.findAll();
	}
	
	//See an unit with its lessons
	@RequestMapping(value = "/lesson/", method = RequestMethod.GET)
	public List<Lesson> getunitwithlesson() {
		return unitService.findAll();
	}
	
	//Create Unit
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Unit nuevoItem(@RequestBody Unit unit) {
		
		Exercise exercise;
		
		unitService.save(unit);
		
		Lesson lesson = unit.getLessons().get(0);
		lesson.setUnit(unit);
		lessonService.save(lesson);
		exercise = lesson.getExercises().get(0);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(1);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(2);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(3);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		
		
		lesson = unit.getLessons().get(1);
		lesson.setUnit(unit);
		lessonService.save(lesson);
		exercise = lesson.getExercises().get(0);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(1);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(2);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(3);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		
		
		
		lesson = unit.getLessons().get(2);
		lesson.setUnit(unit);
		lessonService.save(lesson);
		exercise = lesson.getExercises().get(0);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(1);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(2);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		exercise = lesson.getExercises().get(3);
		exercise.setLesson(lesson);
		exerciseService.save(exercise);
		
		return unit;
	}
	
	@JsonView(UnitBassic.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Unit> getItem(@PathVariable long id) {
		Unit unit = unitService.findById(id);

		if (unit != null) {
			return new ResponseEntity<>(unit, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@JsonView(UnitBassic.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Unit> actulizaItem(@PathVariable long id, @RequestBody Unit unitAct) {

		Unit unit = unitService.findById(id);

		if (unit != null) {
			unit.setName(unitAct.getName());
			unitAct.setId(id);
			unitService.save(unit);
			return new ResponseEntity<>(unit, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}*/
