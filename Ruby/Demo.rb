
fin_src = File.expand_path(".", Dir.pwd) + '/data.in'

File.readlines(fin_src).each do |f|
  puts f
end
