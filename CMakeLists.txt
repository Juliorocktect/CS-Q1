cmake_minimum_required(VERSION 3.13) 
project(CS)

set(CMAKE_CXX_STANDARD 14)
add_subdirectory(CPP/tree)
add_subdirectory(CPP/lw29)
add_executable(CS CPP/main.cpp)
target_link_libraries(CS TREE)
target_link_libraries(CS LW29)