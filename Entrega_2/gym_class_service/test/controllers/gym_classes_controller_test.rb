require "test_helper"

class GymClassesControllerTest < ActionDispatch::IntegrationTest
  setup do
    @gym_class = gym_classes(:one)
  end

  test "should get index" do
    get gym_classes_url, as: :json
    assert_response :success
  end

  test "should create gym_class" do
    assert_difference('GymClass.count') do
      post gym_classes_url, params: { gym_class: {  } }, as: :json
    end

    assert_response 201
  end

  test "should show gym_class" do
    get gym_class_url(@gym_class), as: :json
    assert_response :success
  end

  test "should update gym_class" do
    patch gym_class_url(@gym_class), params: { gym_class: {  } }, as: :json
    assert_response 200
  end

  test "should destroy gym_class" do
    assert_difference('GymClass.count', -1) do
      delete gym_class_url(@gym_class), as: :json
    end

    assert_response 204
  end
end
