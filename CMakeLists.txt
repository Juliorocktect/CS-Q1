cmake_minimum_required(VERSION 3.13) 
project(CS)

set(CMAKE_CXX_STANDARD 14)
add_subdirectory(tree)
add_executable(CS main.cpp)
target_link_libraries(CS TREE)