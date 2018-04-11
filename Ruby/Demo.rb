require_relative "quick_sort.rb"
require_relative "insertion_sort.rb"
require_relative "selection_sort.rb"
require_relative "merge_sort.rb"
require_relative "heap_sort.rb"

def test_sorting(fin, tc)
  fin.sort!
  incorrect = FALSE
  fin.each_with_index do |v, ind|
    incorrect = tc[ind] == v
    break unless incorrect
  end
  p "Sorting is correct" if incorrect
  p "Sorting is incorrect" unless incorrect  
end

## --> Read inputs
fin_src = File.expand_path("..", Dir.pwd) + '/data.in'
fin = []
File.readlines(fin_src).each do |f|
  fin.push(f)
end

# Testcase
tc = fin.dup

## --> Sorting
beginning_time = Time.now
# tc = quick_sort(tc)
# tc = insertion_sort(tc)
# tc = selection_sort(tc)
# tc = merge_sort(tc)
# tc = heap_sort(tc)
tc.sort! #built-in sort

end_time = Time.now

## --> Testing
test_sorting(fin, tc)

# puts "Time elapsed #{(end_time - beginning_time)*1000} milliseconds"
puts "Time elapsed #{(end_time - beginning_time)} seconds"